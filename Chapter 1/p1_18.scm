(define (fast-multiply a b)
	(define (fm-iter product i left)
	 (cond ((= left 0) product)
	       ((> i left) (+ product (fm-iter a 1 (+ left -1))))
	       (else (fm-iter (double product) (double i) (- left i)))))
	(fm-iter a 1 (+ b -1)))	

 (define (double a)
	(+ a a))
(define (halve a)
	(/ a 2))
       
(display (fast-multiply 12 4))
(newline)
