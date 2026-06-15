# Test Strategy

I wrote tests for the existing Gilded Rose behavior before refactoring.

The tests cover:
- normal items
- Aged Brie
- Sulfuras
- Backstage passes
- Conjured items
- quality limits
- behavior after sellIn expired

The goal is to make sure that the next refactoring does not change the existing functionality.

## Refactoring Decisions

I refactored the Gilded Rose update logic without changing the external behavior.

Main changes:
- extracted update methods for each item type
- added helper methods for increasing and decreasing quality
- kept Sulfuras unchanged
- added separate handling for Conjured items
- simplified the main updateQuality method

All existing tests pass after the refactoring.
