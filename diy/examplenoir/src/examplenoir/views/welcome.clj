(ns examplenoir.views.welcome
  (:require [examplenoir.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to examplenoir"]))
