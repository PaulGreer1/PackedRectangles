![Request_response_sequence_diagram](https://github.com/PaulGreer1/WebsiteLamp/blob/main/UKAPPCODER_002.png)

## PackedRectangles

### Overview

Simple weighting map generator.

![Packed_rectangles_example](https://github.com/PaulGreer1/PackedRectangles/blob/main/specification/PackedRectangles.png)

### Requirements

#### 1. Layout, height and distribution of the rectangles

The number of rectangles in a set is a multiple of 4, plus 1. For example:

<pre>
rectangles = { r0, r1, r2, ..., r16 }
</pre>

Each rectangle represents a member of a group of related entities. For example, skills in a skillset. Using this example, each skill is given a weighting to indicate its importance in the skillset. A rectangle's weighting corresponds to its height.

The set of rectangles is ordered by height, with the tallest being at the front of the set. Rectangle widths can vary. This allows a name or a short sentence or graphic to occupy any particular rectangle.

The rectangles are laid out in a manner similar to that shown in the diagram. The tallest rectangle (the rectangle at the front of the set) is placed in the middle, with the rest of the rectangles being placed around the sides of this central rectangle. The rectangles are distributed amongst the sides of the central rectangle as if dealing cards. So, for example, `r1, r2, r3` and `r4` will be on sides `1, 2, 3` and `4` respectively.

So, the importance, or strength, of any particular entity in the set relative to the others, is given by the combination of the height of its rectangle, along with a rough visual proximity to the centre of the group, where increasing distance corresponds to decreasing strength.

#### 2. Drawing the rectangles

A rectangle is drawn from its top-left corner. This is called the 'origin' of the rectangle. In order to draw the rectangles according to the layout described above, we first need to specify generic equations for their origins in terms of `(x,y)` coordinates, heights and widths. We can then use these equations to write the methods that will do the drawing. These drawing methods will be able to handle any set with a number of rectangles that is a multiple of 4, plus 1, without having to modify the methods, (although the methods could be developed later so that number of rectangles is not restricted to a multiple of 4, plus 1).
