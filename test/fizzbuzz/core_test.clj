(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [midje.sweet :refer :all]
            [fizzbuzz.core :refer :all]))

(facts "about fizz"
  (fact "returns 'fizz' if the number it gets is divisible through 3"
    (fizz 3)   => "Fizz"
    (fizz 333) => "Fizz")
  (fact "returns the same number if the number is not divisible through 3"
    (fizz 4)  => 4
    (fizz 22) => 22)
  (facts "with 2 arguments"
    (fact "appends or changes 2nd to 'fizz' if 1st divisible through 3"
      (fizz 33 4) => "Fizz"
      (fizz 333 "Buzz") => "BuzzFizz")
    (fact "leaves the 2nd value unchanged if 1st not divisible throught 3"
      (fizz 44 4) => 4
      (fizz 55 "buzz") => "buzz")))

(facts "about buzz"
  (fact "returns 'buzz' if the number it gets is divisible through 5"
    (buzz 5)   => "Buzz"
    (buzz 550) => "Buzz")
  (fact "returns the same number if the number is not divisible through 5"
    (buzz 4)  => 4
    (buzz 22) => 22)
  (facts "with 2 arguments"
    (fact "appends or changes 2nd to 'buzz' if 1st divisible through 5"
      (buzz 55 4) => "Buzz"
      (buzz 555 "Fizz") => "FizzBuzz")))
