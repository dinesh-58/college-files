# same as ../prolog/2025-01-25/5_kb_family_tree.pl

class Family:
    def __init__(self):
        self.parents = {}  # Stores parent-child relationships

    def add_parent(self, parent, child):
        if child not in self.parents:
            self.parents[child] = []
        self.parents[child].append(parent)

    def is_parent(self, parent, child):
        return parent in self.parents.get(child, [])

    def is_sibling(self, person1, person2):
        return any(parent in self.parents.get(person1, []) and parent in self.parents.get(person2, []) for parent in self.parents.get(person1, []))

    def is_grandparent(self, grandparent, grandchild):
        return any(self.is_parent(grandparent, parent) for parent in self.parents.get(grandchild, []))

    def get_children(self, parent):
        return [child for child, parents in self.parents.items() if parent in parents]

    def get_parents(self, child):
        return self.parents.get(child, [])

# Example usage
family = Family()
family.add_parent("Alice", "Bob")
family.add_parent("Alice", "Charlie")
family.add_parent("Bob", "David")
family.add_parent("Bob", "Emma")

print("Is Alice a parent of Bob?", family.is_parent("Alice", "Bob"))
print("Is Bob a sibling of Charlie?", family.is_sibling("Bob", "Charlie"))
print("Is Alice a grandparent of David?", family.is_grandparent("Alice", "David"))
print("Children of Bob:", family.get_children("Bob"))
