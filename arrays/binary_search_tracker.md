# Binary Search Mastery Tracker

## Day 1: Foundation & Classic Binary Search ✓

### Technical Mastery
- [ ] Can code basic binary search template from memory (2 minutes)
- [ ] Understand when to use `left = mid + 1` vs `left = mid`
- [ ] Know the difference between `while(left < right)` vs `while(left <= right)`
- [ ] Can explain why we use `mid = left + (right - left) / 2`

### Pattern Understanding
- [ ] **Classic Binary Search**: Find exact element in sorted array
- [ ] **Lower Bound**: Find first element ≥ target
- [ ] **Upper Bound**: Find first element > target
- [ ] **Search Range**: Find first and last occurrence of target

### Day 1 Problems (Complete all 5)
1. [ ] **Binary Search (Basic)** (Easy - Find target in sorted array)
2. [ ] **Find First and Last Position of Element** (Medium - Search Range)
3. [ ] **Search Insert Position** (Easy - Lower Bound)
4. [ ] **Find Peak Element** (Medium - Modified Binary Search)
5. [ ] **Search in Rotated Sorted Array** (Medium - Classic Variation)

**Day 1 Goal**: Master the basic binary search template and variations

---

## Day 2: Binary Search on Answer ✓

### Advanced Pattern Recognition
- [ ] Can identify when to apply "Binary Search on Answer"
- [ ] Know how to define search space for answer
- [ ] Understand predicate function (check if answer is possible)

### Binary Search on Answer Pattern
- [ ] **Monotonic Property**: If answer X works, all answers > X also work
- [ ] **Search Space**: Define minimum and maximum possible answers
- [ ] **Check Function**: Function to verify if mid value is valid answer

### Day 2 Problems (Complete all 8)
1. [ ] **Find Minimum in Rotated Sorted Array** (Medium)
2. [ ] **Koko Eating Bananas** (Medium - BS on Answer)
3. [ ] **Minimum Number of Days to Make m Bouquets** (Medium - BS on Answer)
4. [ ] **Capacity to Ship Packages Within D Days** (Medium - BS on Answer)
5. [ ] **Split Array Largest Sum** (Hard - BS on Answer)
6. [ ] **Median of Two Sorted Arrays** (Hard - Advanced BS)
7. [ ] **Find K-th Smallest Pair Distance** (Hard - BS on Answer)
8. [ ] **Aggressive Cows** (Medium - BS on Answer)

**Day 2 Goal**: Master "Binary Search on Answer" pattern

---

## Day 3: Advanced Binary Search & 2D Arrays ✓

### Complex Variations
- [ ] Binary search in 2D matrices
- [ ] Binary search with custom comparisons
- [ ] Binary search on floating point numbers
- [ ] Combining binary search with other techniques

### Day 3 Problems (Complete all 6)
1. [ ] **Search a 2D Matrix** (Medium)
2. [ ] **Search a 2D Matrix II** (Medium)
3. [ ] **Find K-th Smallest Element in Sorted Matrix** (Medium)
4. [ ] **Sqrt(x)** (Easy - Integer square root)
5. [ ] **Valid Perfect Square** (Easy)
6. [ ] **Find Right Interval** (Medium - BS with intervals)

**Day 3 Goal**: Handle complex binary search scenarios

---

## Binary Search Templates ✓

### Template 1: Classic Binary Search
```java
public int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    
    return -1; // Not found
}
```

### Template 2: Lower Bound (First element ≥ target)
```java
public int lowerBound(int[] nums, int target) {
    int left = 0, right = nums.length;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] < target) left = mid + 1;
        else right = mid;
    }
    
    return left;
}
```

### Template 3: Binary Search on Answer
```java
public int binarySearchOnAnswer(int[] nums, int target) {
    int left = minPossibleAnswer, right = maxPossibleAnswer;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (isPossible(nums, mid, target)) {
            result = mid;
            right = mid - 1; // Try for smaller answer
        } else {
            left = mid + 1;
        }
    }
    
    return result;
}

private boolean isPossible(int[] nums, int mid, int target) {
    // Check if 'mid' is a valid answer
    // Return true if possible, false otherwise
}
```

### Template Mastery Check
- [ ] Template 1: Classic BS coded from memory
- [ ] Template 2: Lower/Upper bound coded from memory
- [ ] Template 3: BS on Answer coded from memory

---

## Final Mastery Check ✓

### Pattern Recognition Speed
- [ ] **Classic BS**: Can identify in 15 seconds
- [ ] **BS on Answer**: Can identify in 30 seconds
- [ ] **2D Matrix BS**: Can identify approach quickly
- [ ] **Modified BS**: Can adapt template for variations

### Problem Count Targets
- [ ] **Total Problems Solved**: ___/20+ 
- [ ] **Easy Problems**: Solved in < 5 minutes
- [ ] **Medium Problems**: Solved in < 15 minutes
- [ ] **Hard Problems**: Can break down approach

### Interview Simulation
- [ ] Mock problem 1: Classic BS under pressure
- [ ] Mock problem 2: BS on Answer identification + implementation
- [ ] Mock problem 3: Handled edge cases and follow-ups

### The Ultimate Test
- [ ] **Pattern Recognition**: "This needs BS because..."
- [ ] **Template Selection**: Choose right template immediately
- [ ] **Edge Cases**: Handle duplicates, empty arrays, single elements
- [ ] **Confidence Level**: 8+ out of 10

---

## Daily Progress Log

### Day 1 Progress
**Date**: ___________
**Time Spent**: _____ hours
**Problems Completed**: ___/5  
**Templates Mastered**: 
- [ ] Classic Binary Search
- [ ] Lower/Upper Bound

**Key Insights**: 
- 
- 

**Common Mistakes Made**: 
- 
- 

### Day 2 Progress
**Date**: ___________
**Time Spent**: _____ hours
**Problems Completed**: ___/8
**BS on Answer Understanding**: 
- [ ] Can identify when to use it
- [ ] Can define search space correctly
- [ ] Can write predicate function

**Breakthrough Moments**: 
- 
- 

### Day 3 Progress
**Date**: ___________
**Time Spent**: _____ hours
**Problems Completed**: ___/6
**Advanced Concepts**: 
- [ ] 2D Matrix searches
- [ ] Complex predicate functions
- [ ] Floating point BS

**Final Confidence**: ___/10

---

## Key Insights & Tips ✓

### When to Use Binary Search
- [ ] **Sorted array + Search**: Classic binary search
- [ ] **"Find minimum/maximum such that..."**: Binary search on answer
- [ ] **Monotonic property exists**: Some form of BS applicable
- [ ] **Search space can be defined**: BS on answer candidate

### Common Pitfalls to Avoid
- [ ] **Infinite loops**: Wrong boundary updates
- [ ] **Integer overflow**: Use `left + (right - left) / 2`
- [ ] **Off-by-one errors**: Careful with `<=` vs `<`
- [ ] **Wrong template**: Match template to problem type

### Optimization Tricks
- [ ] **Early termination**: When exact answer found
- [ ] **Boundary handling**: Check edge cases first
- [ ] **Predicate optimization**: Make check function efficient

---

## Integration with Other Patterns ✓

### Binary Search + Sliding Window
- [ ] **Problems combining both patterns**
- [ ] **When BS helps optimize SW solutions**

### Binary Search + Two Pointers  
- [ ] **Finding pairs with BS**
- [ ] **Optimizing two-pointer searches**

### Binary Search + Dynamic Programming
- [ ] **LIS with binary search optimization**
- [ ] **Optimizing DP state transitions**

---

## Next Steps After Mastery
- [ ] **Combine with Sliding Window**: Recognize hybrid problems
- [ ] **Advanced Applications**: Segment trees, coordinate compression
- [ ] **Contest Problems**: Practice time-constrained BS problems
- [ ] **System Design**: Apply BS in distributed systems

**Success Metric**: When you can look at any optimization problem and immediately consider "Can I binary search on the answer?", you've mastered it!