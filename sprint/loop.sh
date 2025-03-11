if [[ $1 -gt 100 ]]
then
    m=100
else
    m=$1
fi

for ((i=0;i<m;i++)); do
    printf $(($i+1))
    printf " times I've printed polinagolubeva\n"
done