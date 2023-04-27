wc -w  technical/plos/*.txt > plos-sizes.txt
sort plos-sizes.txt
less technical/plos/pmed.0020191.txt

wc -c  technical/plos/*.txt > plos-sizes.txt
sort plos-sizes.txt
less technical/plos/pmed.0020073.txt

grep -l "base pair" technical/plos/*.txt
grep "base pair" technical/plos/*.txt
grep -l "base pair" technical/biomed/*.txt
grep -l "base pair" technical/biomed/*.txt > base-pairs.txt
wc base-pairs.txt
grep "base pair" technical/biomed/*.txt > base-pairs.txt
wc base-pairs.txt
grep "base pair" technical/plos/*.txt > plos-bp.txt
wc plos-bp.txt