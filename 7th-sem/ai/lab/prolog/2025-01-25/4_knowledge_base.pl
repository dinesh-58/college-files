likes(ali, football).
likes(ali, tennis).
% test
likes(sujal, tennis).
likes(sujal, handball).
likes(dinesh, handball).
likes(dinesh, swimming).    /* atom */
likes(dinesh, 'swimming').  /* atom */
likes(dinesh, "swimming").  /* string */
likes(jo, horseriding).

/* rule to find people that like a given sport */
likes(Sport) :- likes(X, Sport), write(X).
