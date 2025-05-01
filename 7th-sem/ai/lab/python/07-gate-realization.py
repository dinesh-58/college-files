from math import exp


def sigmod(x):
    return 1/(1 + exp(-x))


def sumation_neural(x1, x2, weights):
    return weights[0] + x1 * weights[1] + x2 * weights[2]


def OR_gate(x1, x2):
    litral_str = f"{x1} OR {x2} = "
    weights = [-1, 2, 2]
    Z = sumation_neural(x1, x2, weights)
    sigmod_val = sigmod(Z)
    if sigmod_val >= 0.5: print(litral_str + "1")
    else: print(litral_str + "0")


def AND_gate(x1, x2):
    litral_str = f"{x1} AND {x2} = "
    weights = [-2, 1, 1]
    Z = sumation_neural(x1, x2, weights)
    sigmod_val = sigmod(Z)
    if sigmod_val >= 0.5: print(litral_str + "1")
    else: print(litral_str + "0")


for x1 in range(2):
    for x2 in range(2):
        AND_gate(x1, x2)

for x1 in range(2):
    for x2 in range(2):
        OR_gate(x1, x2)
