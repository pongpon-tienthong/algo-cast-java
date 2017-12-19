### Chunk
Directions
```
Given an array and chunk size, divide the array into many subarrays
where each subarray is of length size
```
Examples
```
chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
```

### Anagrams
Directions
```
Check to see if two provided strings are anagrams of eachother.
One string is an anagram of another if it uses the same characters
in the same quantity. Only consider characters, not spaces
or punctuation.  Consider capital letters to be the same as lower case
```
Examples
```
anagrams('rail safety', 'fairy tales') --> True
anagrams('RAIL! SAFETY!', 'fairy tales') --> True
anagrams('Hi there', 'Bye there') --> False
```