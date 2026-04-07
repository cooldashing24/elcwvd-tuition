#!/bin/bash

# Download VNSGU BCA Sem 4 April 2025 Practical Papers
# Organizes by subject while preserving original filenames

BASE_DIR="/home/vishnudamwala/Development/Projects/ELCWVD/tuition/Resources/PastPapers/VNSGU/BCA/SEM4/2025/April/Practical"
LINKS_FILE="$BASE_DIR/links.txt"

# Counters
TOTAL=0
SUCCESS=0
FAILED=0

# Function to get destination directory based on filename pattern
get_destination_dir() {
    local filename="$1"
    
    if [[ "$filename" == *"_403_"* ]] || [[ "$filename" == *"403_"* ]]; then
        echo "403-java"
    elif [[ "$filename" == *"_404_"* ]] || [[ "$filename" == *"404_"* ]]; then
        echo "404-net-programming"
    elif [[ "$filename" == *"405_1_"* ]] || [[ "$filename" == *"405_01_"* ]] || [[ "$filename" == *"Web_Desining"* ]] || [[ "$filename" == *"Web_Designing"* ]]; then
        echo "405-web-design"
    elif [[ "$filename" == *"405_2_"* ]] || [[ "$filename" == *"405_02_"* ]] || [[ "$filename" == *"Mob_App_Dev"* ]] || [[ "$filename" == *"MOBILE_APPLICATION_DEVELOPMENT"* ]]; then
        echo "405-mobile-app"
    elif [[ "$filename" == *"_406_"* ]] && [[ "$filename" != *"_403_"* ]]; then
        echo "406-practical"
    elif [[ "$filename" == *"402_01_"* ]] || [[ "$filename" == *"INTERNET_OF_THINGS"* ]] || [[ "$filename" == *"IoT"* ]]; then
        echo "402-iot"
    elif [[ "$filename" == *"402_02_"* ]] || [[ "$filename" == *"UI_UX_DESIGN"* ]] || [[ "$filename" == *"USER_INTERFACE"* ]]; then
        echo "402-ui-ux"
    elif [[ "$filename" == *"407_"* ]] || [[ "$filename" == *"BHARATIYA_GYAN"* ]] || [[ "$filename" == *"VAC"* ]]; then
        echo "407-vac"
    else
        echo ""
    fi
}

echo "=============================================="
echo "VNSGU BCA Sem 4 Papers Downloader"
echo "=============================================="
echo ""

# Read links and process
while IFS= read -r url; do
    # Skip empty lines
    [[ -z "$url" ]] && continue
    
    TOTAL=$((TOTAL + 1))
    
    # Extract filename from URL
    filename=$(basename "$url")
    
    # Get destination directory
    dest_dir=$(get_destination_dir "$filename")
    
    if [[ -z "$dest_dir" ]]; then
        echo "[$TOTAL] ⚠️  Could not categorize: $filename"
        echo "     -> Skipping (unknown subject)"
        FAILED=$((FAILED + 1))
        continue
    fi
    
    dest_path="$BASE_DIR/$dest_dir/$filename"
    
    echo "[$TOTAL] Downloading: $filename"
    echo "     -> Destination: $dest_dir/"
    
    # Download the file
    if wget -q --show-progress -O "$dest_path" "$url" 2>&1 | grep -E '(saved|error|failed)'; then
        if [[ -f "$dest_path" && -s "$dest_path" ]]; then
            filesize=$(du -h "$dest_path" | cut -f1)
            echo "     ✓ Downloaded ($filesize)"
            SUCCESS=$((SUCCESS + 1))
        else
            echo "     ✗ Download failed or empty file"
            rm -f "$dest_path"
            FAILED=$((FAILED + 1))
        fi
    else
        # Double-check if file exists
        if [[ -f "$dest_path" && -s "$dest_path" ]]; then
            filesize=$(du -h "$dest_path" | cut -f1)
            echo "     ✓ Downloaded ($filesize)"
            SUCCESS=$((SUCCESS + 1))
        else
            echo "     ✗ Download failed"
            rm -f "$dest_path"
            FAILED=$((FAILED + 1))
        fi
    fi
    
    echo ""
    
done < "$LINKS_FILE"

echo "=============================================="
echo "Download Complete!"
echo "=============================================="
echo "Total URLs: $TOTAL"
echo "Successful: $SUCCESS"
echo "Failed: $FAILED"
echo ""
echo "Files by subject:"
echo "  Java (403):         $(ls -1 $BASE_DIR/403-java/*.pdf 2>/dev/null | wc -l) files"
echo "  Net Programming (404): $(ls -1 $BASE_DIR/404-net-programming/*.pdf 2>/dev/null | wc -l) files"
echo "  Web Design (405_1):    $(ls -1 $BASE_DIR/405-web-design/*.pdf 2>/dev/null | wc -l) files"
echo "  Mobile App (405_2):  $(ls -1 $BASE_DIR/405-mobile-app/*.pdf 2>/dev/null | wc -l) files"
echo "  Practical (406):    $(ls -1 $BASE_DIR/406-practical/*.pdf 2>/dev/null | wc -l) files"
echo "  IoT (402_01):       $(ls -1 $BASE_DIR/402-iot/*.pdf 2>/dev/null | wc -l) files"
echo "  UI/UX (402_02):     $(ls -1 $BASE_DIR/402-ui-ux/*.pdf 2>/dev/null | wc -l) files"
echo "  VAC (407):          $(ls -1 $BASE_DIR/407-vac/*.pdf 2>/dev/null | wc -l) files"
