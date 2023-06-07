## PackedRectangles

### Overview

Simple weighting map generator.

![Packed_rectangles_example](https://github.com/PaulGreer1/PackedRectangles/blob/main/specification/PACKED_RECTANGLES.png)

### Requirements

#### 1. Layout, height and distribution of the rectangles

The number of rectangles in a set is a multiple of 4, plus 1. For example:

<pre>
rectangles = { r0, r1, r2, ..., r16 }
</pre>

Each rectangle represents a member of a related group of entities. For example, skills in a skillset. Using this example, each skill is given a weighting to indicate its importance in the skillset. A rectangle's weighting corresponds to its height.

The set of rectangles is ordered by height, with the tallest being at the front of the set. Rectangle widths can vary. This allows a name or a short sentence or graphic to occupy any particular rectangle.

The rectangles are laid out in a manner similar to that shown in the diagram. The tallest rectangle (the rectangle at the front of the set) is placed in the middle, with the rest of the rectangles being placed around the sides of this central rectangle. The rectangles are distributed amongst the sides of the central rectangle as if dealing cards. So, for example, `r1, r4, r7` and `r10` will be on sides `1, 2, 3` and `4` respectively.

So, the importance, or strength, of any particular rectangle is given by the combination of its height and its distance from the centre of the group.

#### 2. Drawing the rectangles

A rectangle is drawn from its top-left corner. This is called the 'origin' of the rectangle. In order to draw the rectangles according to the layout described above, we first need to specify generic equations for their origins in terms of `(x,y)` coordinates, heights and widths. We can then use these equations to write the methods that will do the drawing. These drawing methods will be able to handle any set with a number of rectangles that is a multiple of 4, plus 1, without having to modify the methods.

