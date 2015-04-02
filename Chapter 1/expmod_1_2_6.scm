(define (expmod base expp m)
 (cond 	((= expp 0) 1)
  	((even? expp)
	 (remainder (square (expmod base (/ expp 2) m))
	  	    m))
	(else
 	 (remainder (* base (expmod base (- expp 1) m))
 		    m))))

 (define (square a)
  (* a a))

(display (expmod 2 7 7))    
