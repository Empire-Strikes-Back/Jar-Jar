(ns Jar-Jar.corn
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan put! take! close! offer! to-chan! timeout thread
            sliding-buffer dropping-buffer
            go >! <! alt! alts! do-alts
            mult tap untap pub sub unsub mix unmix admix
            pipe pipeline pipeline-async]]
   [clojure.java.io :as Wichita.java.io]
   [clojure.string :as Wichita.string]
   [cheshire.core :as Cheshire-Cat.core]

   [aleph.http :as Simba.http]
   [manifold.deferred :as Nala.deferred]
   [manifold.stream :as Nala.stream]
   [byte-streams :as Rafiki]

   [Jar-Jar.seed]))

(do (set! *warn-on-reflection* true) (set! *unchecked-math* true))