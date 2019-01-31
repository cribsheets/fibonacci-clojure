#!/usr/bin/env clj

; this function returns 0, 1, or the sum of the
; previous two numbers in the fibonacci sequence
(defn fibonacci [n]
  ; a cond statement is the best choice here, since the first
  ; matching condition will fire.
  (cond (== 0 n) 0
        (== 1 n) 1
        ; the :else case covers all cases where nothing else has fired.
        :else (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

; in the let, we cast the first command line arg into an integer
(let [number (Integer/parseInt (first *command-line-args*))]
  ; call the recursive fibonacci function with the resulting number
  (println "F(" number ") = " (fibonacci number)))
