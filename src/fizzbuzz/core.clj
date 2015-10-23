(ns fizzbuzz.core
  (:gen-class)
  (:require [clojure.string :as s :refer [join]]))

(defmacro string-if-modulo
  "Changes the integer to string s if the integer is divisible through
   modulo. Basic building block for the Fizz and Buzz function from
   the fizzbuzz problem"
  [s modulo]
  `(fn
     ([x#]
      (if (zero? (mod x# ~modulo)) ~s x#))
     ([x# y#]
      (if (zero? (mod x# ~modulo))
        (if (string? y#)
          (str y# ~s)
          ~s)
        y#))))

(def fizz (string-if-modulo "Fizz" 3))

(def buzz (string-if-modulo "Buzz" 5))

(defn fizzbuzz [x]
  (let [xs (range 1 x)]
    (->> (map fizz xs)
         (map buzz xs))))

(defn -main
  "I print FizzBuzz"
  [& args]
  (do
    (println "How long is the FizzBuzz string?:")
    (let [x (read-string (read-line))]
      (->> (fizzbuzz x)
           (map str)
           (s/join ", ")
           (println)))))
