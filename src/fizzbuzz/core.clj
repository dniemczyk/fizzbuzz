(ns fizzbuzz.core
  (:gen-class)
  (:require [clojure.string :as s :refer [join]]))

(defn fizz
  "Changes an integer to the word 'Fizz' if it is divisible through 3"
  ([x]
   (if (zero? (mod x 3))
     "Fizz"
     x))
  ([x y]
   (if (zero? (mod x 3))
     (if (string? y)
       (str y "Fizz")
       "Fizz")
     y)))

(defn buzz
  "Changes an integer to the word 'Buzz' if it is divisible through 5"
  ([x]
   (if (zero? (mod x 5))
     "Buzz"
     x))
  ([x y]
   (if (zero? (mod x 5))
     (if (string? y)
       (str y "Buzz")
       "Buzz")
     y)))

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
