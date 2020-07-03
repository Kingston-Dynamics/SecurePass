# SecurePass

### Overview

This library is a small library used for handling password hashing for storage and verification purposes.

Provided passwords are initially hashed using SHA-512. This is done so that passwords of arbitrary length may be used. The underlying password hashing function, bcrypt, has an upper limit on password length and this initial hashing step removes the necessity to account for that. While this does effectively change the users password to be the generated hash instead of their provided value it shouldn't affect the overall security. 

### Developers Note

This library, or an approximation of it, is being used internally by us. The code inside this repository is reflective of how we store and handle our users passwords across any and all applications. 

