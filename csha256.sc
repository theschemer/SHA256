
(library (csha256 csha256)
  (export
    sha256
  )
  (import
    (scheme)
  )


  (define lib (load-shared-object "./lib/csha256/sha256.so"))

  (define sha256
    (foreign-procedure "sha256" (string) string))
 
 
 )
