(ns ^:figwheel-no-load noisome.dev
  (:require
    [noisome.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
