(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [midje.sweet :refer :all]
            [fizzbuzz.core :refer :all]))

(facts "about fizz"
  (fact "Fizz returns 'fizz' if the number it gets is divisible through 3"
    (fizz 3) => "Fizz"
    (fizz 333) => "Fizz"))
