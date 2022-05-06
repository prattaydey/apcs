Mamba  :: Prattay Dey, Nafiz Labib, Kartik Varjani
APCS pd08
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent: 0.5 hrs


DISCO
------------------------------------------------
* Every perfect tree is complete, and every complete tree is balanced. 
================================================


QCC
------------------------------------------------
* What does "Is the Man Who Is Tall Happy" mean in terms of binary trees? It seems to be a reference to a French documentary but we can't draw the connection.
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
A tree grows downwards.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
A tree is a graph which is connected as an open tour, meaning that each node is visited exactly one time. Likewise, the starting and terminating node are never the same. 


Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
A balanced tree makes node traversal easily, but it is unlikely for a tree to always be height-balanced. 

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
A tree in which the height of the left and right are within 1 level of each other. 

Is a perfect tree complete? 
A perfect tree is always complete as every level is always full, and therefore also filled in. 

Is a complete tree balanced? 
Yes every complete tree is balanced as the most extreme case of a complete tree is that the bottom level is left-justified, which would still have a height difference of 1 and be considered balanced. 

Is the Man Who Is Tall Happy?

What must be true of perfect trees but not others?
Perfect trees MUST have every level filled. This means that each node must be a parent to two children nodes, with the exception of the very bottom level.
================================================


C'EST POSSIBLE?
------------------------------------------------
It is possible, but there can be multiple reconstructions of the tree so there isn't one single right answer. 
================================================


