(ns fizzbuzz.core
  (:gen-class))

(defn fizz
  "Changes an integer to the word 'Fizz' if it is divisible through 3"
  [x]
  (if (zero? (mod x 3))
    "Fizz"
    x))

(defn buzz
  "Changes an integer to the word 'Buzz' if it is divisible through 5"
  ([x]
   (if (zero? (mod x 5))
     "Buzz"
     x))
  ([y x]
   (if (zero? (mod x 5))
     (if (string? y)
       (str y "Buzz")
       "Buzz")
     y)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
