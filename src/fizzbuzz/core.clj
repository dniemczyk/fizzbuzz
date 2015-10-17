(ns fizzbuzz.core
  (:gen-class))

(defn fizz
  "Changes an integer to the word 'Fizz' if it is divisible through 3"
  [x]
  (if (zero? (mod x 3))
    "Fizz"
    x))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
