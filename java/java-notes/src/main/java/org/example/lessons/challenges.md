# JavaScript Challenges

---

## Challenge: Positive or Negative?

- Scan user input and print:
    - `"n is positive"` if `n` (the number that was scanned) is positive
    - `"n is negative"` if `n` is negative

---

## Challenge: Find the Largest Input

- Get **3 numbers** from the user
- Print:  
  `"n is the largest"` — where `n` is the largest of the 3 inputs

---

## Challenge: Rounding Floats

- Request **2 float inputs** from the user
- Round both to **3 decimal places**
- Compare the rounded values:
    - If they are the same:  
      `"Both numbers are n after rounding"`
    - Else:  
      `"n1 and n2 are different numbers"` — `n1` and `n2` being the rounded values

---

## Challenge: What's the Number of x in y?

- Scan user input **twice**
- Allowed inputs:
    - `"s"` → seconds
    - `"m"` → minutes
    - `"h"` → hours
    - `"D"` → days
    - `"M"` → months
    - `"Y"` → years

### Input → Output Examples:

- 1st: `"M"`, 2nd: `"D"` → `"There are 30 days in a month"`
- 1st: `"M"`, 2nd: `"h"` → `"There are 720 hours in a month"`
- 1st: `"h"`, 2nd: `"s"` → `"There are 3600 seconds in an hour"`
- 1st: `"M"`, 2nd: `"Y"` → `"There are no years in a month"`
- 1st: `"s"`, 2nd: `"h"` → `"There are no hours in a second"`

### Assumptions:

- There are **30 days in a month**
