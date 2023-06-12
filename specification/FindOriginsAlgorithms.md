## Calculating the rectangle origins
<hr>

### Top-side rectangles

Finds the (x,y) coordinates for the origins of the top-side rectangles.

#### Coordinates:

<pre>
r1(x,y)  =  ( r0.x , r0.y + r1.height )
r2(x,y)  =  ( r0.x + r1.width , r0.y + r2.height )
r3(x,y)  =  ( r0.x + r1.width + r2.width , r0.y + r3.height )

r1.x  =  r0.x
r2.x  =  r1.x + r1.width
r3.x  =  r2.x + r2.width
</pre>

#### Pseudocode:

<pre>
for( i = 0; i < 3; i++ ) {
    if( i == 0 ) {
        r[i+1].x = r[i].x
    } else {
        r[i+1].x = r[i].x + r[i].w
    }
    r[i+1].y = r[0].y + r[i+1].h
}
</pre>
<hr>

### Left-side rectangles

Finds the (x,y) coordinates for the origins of the left-side rectangles.

#### Coordinates:

<pre>
r10(x,y)  =  ( r0.x - r10.width , ( r0.y - r0.height ) + r10.height )
r11(x,y)  =  ( r0.x - r11.width , ( r0.y - r0.height ) + r10.height + r11.height )
r12(x,y)  =  ( r0.x - r12.width , ( r0.y - r0.height ) + r10.height + r11.height + r12.height )
</pre>

#### Pseudocode:

<pre>
numToAdd = 0
startPointY = r[0].y - r[0].h
for( i = 10; i < 13; i++ ) {
    r[i].x = r[0].x - r[i].w
	numToAdd += r[i].h
	r[i].y = startPointY + numToAdd
}
</pre>
<hr>

### Right-side rectangles

Finds the (x,y) coordinates for the origins of the right-side rectangles.

#### Coordinates:

<pre>
r4(x,y)  =  ( ( r0.x + r0.width) , r0.y )
r5(x,y)  =  ( ( r0.x + r0.width) , r0.y - r4.height )
r6(x,y)  =  ( ( r0.x + r0.width) , r0.y - r4.height - r5.height )

r4(x,y)  =  ( ( r0.x + r0.width) , r0.y )
r5(x,y)  =  ( ( r0.x + r0.width) , r0.y - r4.height )
r6(x,y)  =  ( ( r0.x + r0.width) , r0.y - ( r4.height + r5.height ) )
</pre>

#### Pseudocode:

<pre>
numToSubtract = 0
for( i = 4 i <7; i++ ) {
    r[i].x = r[0].x + r[0].w
    if( i == 4 ) {
        r[i].y = r[0].y
    }
    else {
        numToSubtract += r[i-1].h
        r[i].y = r[0].y - numToSubtract
    }
}
</pre>
<hr>

### Bottom-side rectangles

Finds the (x,y) coordinates for the origins of the bottom-side rectangles.

#### Coordinates:

<pre>
r7(x,y)  =  ( ( r0.x + r0.width ) - ( r7.width ) , ( r0.y - r0.height ) )
r8(x,y)  =  ( ( r0.x + r0.width ) - ( r7.width - r8.width ) , ( r0.y - r0.height ) )
r9(x,y)  =  ( ( r0.x + r0.width ) - ( r7.width - r8.width - r9.width ) , ( r0.y - r0.height ) )
</pre>

#### Pseudocode:

<pre>
numToSubtract = 0
startPointX = r[0].x + r[0].w
for( i = 7; i < 10; i++ ) {
    r[i].y = r[0].y - r[0].h
    numToSubtract -= r[i].w
    r[i].x = startPoint - numToSubtract
}
</pre>
<hr>
