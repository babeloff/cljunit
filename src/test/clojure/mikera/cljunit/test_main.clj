(ns mikera.cljunit.test-main
  (:use clojure.test)
  (:use mikera.cljunit.core))

(deftest test-core
  (testing "Core"
    (is (= 1 1))))

(deftest test-namespaces
  (testing "Core"
    (let [nms (get-test-namespace-names)
          nmset (into #{} nms)]
      ;; (println nms)
      (is (nmset "mikera.cljunit.core")))))

(deftest failing-assertion
;;  (is (= 1 2))
  ) 

