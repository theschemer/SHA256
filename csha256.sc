
(library (csha256 csha256)
  (export
    todo
  )
  (import
    (scheme)
  )


  (define lib (load-shared-object "./lib/csha256/sha256.so"))

  (define to
    (foreign-procedure "todo" (string) string))
 
 
 )
