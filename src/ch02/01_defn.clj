(require '[clojure.pprint :as pp])
(defn ^{:t1 1} foo
  "docstring"
  {:t2 2} (^{:t3 3} [a b] {:t4 4} (+ a b))
  {:t5 5})

(pp/pprint (meta #'foo))