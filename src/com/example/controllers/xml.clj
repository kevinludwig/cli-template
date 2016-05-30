(ns com.example.controllers.xml
    (:require 
        [clojure.data.xml :refer [parse-str]]
        [clojure.zip :refer [xml-zip]]
        [clojure.data.zip.xml :refer [xml1-> text]]
        [ring.util.response :refer [response]]
        [taoensso.timbre :as log]))

(def data (str "<?xml version=\"1.0\" standalone=\"yes\"?>"
    "<top><a>Value 1</a><b>Value 2</b><c>Value 3</c><d>Value 4</d></top>"))

(defn- parse-xml [data]
    (-> data parse-str xml-zip))

(defn xml [node]
    (let [zipper (parse-xml data)
          value (xml1-> :top (keyword node) text)]
          (response {:value value})))
