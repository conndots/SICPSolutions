(define (fast-multiply a b)
 (cond ((= b 0) 0)
       ((even? b) (double (fast-multiply a (halve b))))
       (else (+ a (fast-multiply a (+ b -1))))))
 (define (double a)
	(+ a a))
(define (halve a)
	(/ a 2))
       
(display (fast-multiply 12 4))
(newline)


	
