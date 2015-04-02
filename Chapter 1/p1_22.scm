
(define (smallest-divisor n)
 (find-divisor n 2))

(define (find-divisor n test-divisor)
 (cond  ((> (square test-divisor) n) n)
  	((divides? test-divisor n) test-divisor)
	(else (find-divisor n (+ test-divisor 1)))))

(define (divides? a b)
 (= (remainder b a) 0))

(define (square a)
 (* a a))

(define (prime? n)
 (= n (smallest-divisor n)))

(define (timed-prime-test n)
 (newline)
 (display n)
 (start-prime-test n (runtime)))

(define (start-prime-test n start-time)
 (if (prime? n)
     (report-prime (- (runtime) start-time))))

(define (report-prime elapsed-time)
 (display " *** ")
 (display elapsed-time))

(define (search-for-primes n)
 (cond ((= (remainder n 2) 0) (search-for-primes (+ n 1)))
       (else
	(timed-prime-test n)
	(if (not (prime? n))
	(search-for-primes (+ n 2))))))

(search-for-primes 1000)
(search-for-primes 10000)
(search-for-primes 100000)
