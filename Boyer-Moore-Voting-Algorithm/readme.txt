This is one of the optimal algorithm which is commonly used to find the majority element.
For example if you are asked to find the element which occured more than n/2 times in an array where n is the length of the array.
input ={1,2,1,1,3} where n = 5 and by seeing this you can say that 1 is the most occured element. since k > n /2 where k is no of occurence of 1 i.e 3 which is greater than n /2(5/2 => 2)
Difference approches to solve this kinda problems:
1. First approaches comes to your mind should be brute force but its time complexity is n * 2
2. Next approaches you may think is to solve using hashmap or hashtable but it's space complexity of O(n)
3. You may ask how do you solve this kinda problem in linear time with constant space complexity.
=>Yes, it is possible to solve using Boyer Moore voting algorithm. Before learning this algorithm first of all you need to know the idea behind it
let us consider an array which contains an element like {1, 2, 1, 1, 3, 2}. In this array there is no element more than n/2 i.e 6/2 = 3 no element occures more than 3 times
Even though 1 occures 3 times it still less than n/2. From this we came to knew that atmost one element can occur more than n/2.i.e In an any array which contains any number of elements the answer would be 0 elements or only one element.
Similary for an n/3 times the no of element would be atmost 2 times.
From this we understood that for any n/k(where k is constant in an problem which may be 1 or 2 or 3) times occurence the no of element in array more than n/k times would be greater or equal to 0 and must be less than k.

