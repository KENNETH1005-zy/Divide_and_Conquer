#Challenge: Peak Element


##Definition:
“A peak element in an array is the element which is always greater than or equal to its neighbors.”

##Problem Statement

Given an array of integers int arr[], return a peak element. In other words, return the index of any peak element in the array.

##Details
	•	Peak Element:
The element is considered a peak if it is greater than or equal to its neighbors.
	•	For non-boundary elements:
An element arr[i] is a peak if:(arr[i] >= arr[i - 1]) && (arr[i] >= arr[i + 1])
