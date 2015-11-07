(define (f n)
 (define (f-iter a b c i)
  (cond ((= i n) c)
   	((= i 0) (f-iter a c b (+ i 1)))
	((= i 1) (f-iter a c b (+ i 1)))
	(else (f-iter b c (+ c
			     (* b 2)
			     (* a 3))
	              (+ i 1)))))
 (f-iter 0 1 2 0))

(display (f 10))
(newline)

(define (ff n)
 (if (< n 3)
  	n
	(+ (f (- n 1)) (* 2 (f (- n 2))) (* 3 (f (- n 3))))))

(display (ff 10))
(newline)
(display (f 20))
(newline)
(display (ff 20))
(newline)
