(define (pascal row col)
	(cond	((or (= col 1) (= col row)) 1) 
		((or (< col 1) (> col row)) 0)
		(else	(+ (pascal (- row 1) (- col 1)) (pascal (- row 1) col)))))
  
(display (pascal 15 3))
(newline)
