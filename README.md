# programming-challenge

## Pre requirements
- Install Oracle/SAP JDK (version 1.8 or higher)
- Install Maven

# Options of optimization

From my side for optimization I decided to use Spring Cache.
I provided 2 variants, you can see them in branches version-1 and version-2.

1. Branch version-1.

- For caching endpoint distanceInMeter(LatLong from, LatLong to) I used annotation @Cacheable org.springframework.cache.annotation.Cacheable using params for it value and keys.
- For clearing cache I configured special file ehcache.xml, you can find it in the resources, here you can control time for clearing cache.

2. Branch version-2.

- For caching endpoint distanceInMeter(LatLong from, LatLong to) I used annotation @Cacheable org.springframework.cache.annotation.Cacheable using params for it value and keys.
- For clearing cache I used annotation @CacheEvict org.springframework.cache.annotation.CacheEvict using params for it value and keys. Using this annotation cache will be cleared automatically when you trigger endpoint updateDistance(LatLong from, LatLong to).


# Answers for questions
1. How would you test this class? 

For testing logic I would implement unit tests and integration tests with cases such:

- Check is data saving to cache
- Check is data clearing from the cache at the needed moment
- Check is data from the cache is the same which we plan to add
  

2. After the method above is on production, how would you monitor the performance? 

- From my perspective, I added the special tool Actuator.

With that tools using http://localhost:8080/actuator/health you can check: is your prod version run successufully or not.

With that tools using http://localhost:8080/actuator/metrics you can check metrics.
   

3. In some cases, we would like to change the provider, for example for tests or different cluster. How can we achieve this?
