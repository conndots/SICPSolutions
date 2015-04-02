(define (square n)
 	(* n n))

(define (fast-expt b n)
	(define (fast-expt-iter product i left)
		(cond	((= left 0) product)
			((> i left) (* product (fast-expt-iter b 1 (- left 1))))
			(else (fast-expt-iter (square product)
				    (* i 2)
				    (- left i)))))
	(fast-expt-iter b 1 (- n 1)))
	
(display (fast-expt 3 7))
(newline)			    
				    
