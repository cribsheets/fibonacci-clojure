#!/usr/bin/env clj

; first things first, we need to cast the String from the command
; line into an integer. we do this within the let, which will remain
; throughout the execution
(let [number (Integer/parseInt (first *command-line-args*))]
  ; a `cond` suffices to filter out the 0 and 1 case
  (cond (== 0 number) (println "F(" number ") = 0")
        (== 1 number) (println "F(" number ") = 1")
        ; for all other cases, we use a loop/recur, appending
        ; the sum of the last two elements of v to v. when we've
        ; reached our target value, we print it.
        :else (loop [v [0 1]]
                (if (> (.size v) number)
                  (println "F(" number ") = " (last v))
                  ; this line recurs the loop, using as v the sum
                  ; (reduce + .. ) of the subvector of the last two elements
                  ; of v.
                  (recur (conj v (reduce + (subvec v (- (.size v) 2)))))))))
