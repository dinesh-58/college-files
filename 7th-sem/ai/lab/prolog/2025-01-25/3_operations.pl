operations:- write('Enter 1st num '),
          read(X),
          write('Enter 2nd num '),
          read(Y),
          format('sum: ~f \n', X+Y),
          format('sub: ~f \n', X-Y),
          format('product: ~f \n', X*Y),
          format('division: ~f \n', X/Y),
          format('remainder: ~d', mod(X,Y)).
