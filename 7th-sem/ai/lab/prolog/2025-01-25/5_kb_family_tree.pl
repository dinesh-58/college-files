parent(pam, bob).
parent(tom, bob).
parent(tom, liz).
parent(bob, ann).
parent(bob, pat).
parent(pat, jim).

grandparent(X,Y):- parent(Z,Y),parent(X,Z).
sibling(X,Y):- parent(Z,X),parent(Z,Y).
uncle(X,Y):- grandparent(Z,Y),parent(Z,X),not(parent(X,Y)).
% or 
% uncle(X,Y):- parent(Z,Y),sibling(X,Z),not(parent(X,Y)).
% e.g: unlce(X,ann). 
