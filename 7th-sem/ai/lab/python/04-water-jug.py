from collections import defaultdict

jug1, jug2, aim = 3, 2, 1
visited = defaultdict(lambda: False)  # creates dict w/ default values False.
# If one of the jugs contains the exact target amount (aim) and the other is
# empty, print the solution and stop.


def waterJugSolver(amt1, amt2):
    if (amt1 == aim and amt2 == 0) or (amt2 == aim and amt1 == 0):
        print(amt1, amt2)
        return True

    # Checking If a State Was Visited
    if visited[(amt1, amt2)] is False:
        print(amt1, amt2)
        visited[(amt1, amt2)] = True

        # these are rules that would be defined in state space diagram
        return (waterJugSolver(0, amt2) or  # empty jug 1
                waterJugSolver(amt1, 0) or
                waterJugSolver(jug1, amt2) or
                waterJugSolver(amt1, jug2) or
                waterJugSolver(amt1 + min(amt2, (jug1 - amt1)), # Pour water from Jug 2 to Jug 1
                               amt2 - min(amt2, (jug1 - amt1))) or
                waterJugSolver(amt1 - min(amt1, (jug2 - amt2)),
                               amt2 + min(amt1, (jug2 - amt2))))
    else:
        return False


print("Steps: ")
waterJugSolver(0, 0)  # Starts with both jugs empty (0, 0)
