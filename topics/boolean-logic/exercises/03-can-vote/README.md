# Can Vote

## Problem

Write a method that returns `true` if a person is eligible to vote. A person can vote if they are **at least 18 years old** AND they are **a citizen**.

## Examples

```
canVote(20, true)  → true   (old enough and a citizen)
canVote(17, true)  → false  (too young)
canVote(20, false) → false  (not a citizen)
canVote(17, false) → false  (too young and not a citizen)
canVote(18, true)  → true   (exactly 18 and a citizen)
```

## Hint

Both conditions must be true at the same time. The `&&` operator does exactly this.
