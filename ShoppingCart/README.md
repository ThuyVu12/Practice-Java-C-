Program Description:
Many websites and other computer programs allow a user to buy items by placing those items in a virtual shopping cart. In this assignment, a set of classes will be written for a simple shopping cart program.

Prices are expressed using doubles and quantities are expressed as simple integers (e.g., 2.345 of something can't be bought). Notice that some of the items have a discount when they are bought more. For example, silly putty normally costs $3.95 each, but they can be bought at 10 for $19.99. These items have, in effect, two prices: a single item price and a bulk item price for a bulk quantity. When computing the price for such an item, apply as many of the bulk quantity as the program can and then use the single item price for any leftovers. For example, the user is ordering 12 buttons that cost $0.99 each but can be bought in bulk 10 for $5.00. The first 10 are sold at that bulk price ($5.00) and the two extras are charged at the single item price ($0.99 each) for a total of $6.98.

At the bottom of the frame a checkbox for an overall discount is present. If this box is checked, the user is given a 10% discount off the total price. This is computed using simple double arithmetic, computing a price that is 90% of what it would be otherwise.

The order total should only update when the Calculate Total button is pressed.
