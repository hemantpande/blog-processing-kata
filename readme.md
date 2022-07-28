# Text processing Kata

## Objective
The main objective is of this Kata is to focus on below skills

- Outside-in problem solving
- TDD
- Making better choice of algorithms

## Problem statement
As a developer that writes blog posts I want a tool that helps me to understand better the text I am writing.

For that I need a way to know the following:

- [Use case 1] What are the most common words used in the text (case-insensitive)?
- [Use case 2] I should be able to see the top 10 words with respect to frequency.
- [Use case 3] How many words does the text have?

```
interface Processor {
    analyse(text: string);
}
```

## Checkpoint 1
Given the following text as input:

```
Hello, this is an example for you to practice. You should grab this text and make it as your test case.
```
The output should be:

```
Those are the top 10 words used:

1. you
2. this
3. your
4. to
5. text
6. test
7. should
8. practice
9. make
10. it

The text has in total 21 words
```

## Checkpoint 2
Now I would like to know how much time would it take the user to read my post, for that I should apply the following formula:

(The average reading rate is approximately 200)

_Here's the formula:_

Get your total word count (including the headline and subhead).
Divide total word count by 200. The number before the decimal is your minutes.
Take the decimal points and multiply that number by .60. That will give you your seconds.

Example:

783 words ÷ 200 = 3.915 (3 = 3 minutes)

.915 × .60 = .549 (a little over 54 seconds, so we can bump it up to 60 seconds, or a full minute)

reading time for this example article is 4 minutes.

## Checkpoint 3
Besides the previous features, the text processing also should have:

A way to ignore a given piece of text to analyse (For example, a code snippets - the code snippet is in between javascript anything inside should be ignored)
A way to offer stop words and remove them from the analysis
Given the example for 1, this would be a text with code snippets:

```
Hello, this is an example for you to practice. You should grab
this text and make it as your test case:

    if (true) {
        console.log('should should should')
    }
```
The text processing output should ignore the code snippet. Meaning, that the output should be:

```
Those are the top 10 words used:

1. you
2. this
3. your
4. to
5. text
6. test
7. should
8. practice
9. make
10. it

The text has in total 21 words
```
