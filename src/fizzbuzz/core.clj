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
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
