total=$(find . -type f -o -type d | wc -l)

result=$((total * 5))

printf "\t\vTotal files * 5: "
printf $result
printf "\v\n"