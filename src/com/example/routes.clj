(ns com.example.routes
    (:require 
        [compojure.core :refer [defroutes GET]]
        [compojure.route :as route]
        [com.example.controllers.xml :as xml]
        [com.example.controllers.notfound :as notfound))

(defroutes main-routes
    (GET "/xml/:node" [node] (xml node))
    (route/not-found (notfound)))
