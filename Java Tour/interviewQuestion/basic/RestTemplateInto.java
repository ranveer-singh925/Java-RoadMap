package interviewQuestion.basic;


public class RestTemplateInto {
    public static void main(String[] args) {

        // @GetMapping("/")
        // public String test(){
        // try {
        // ResponseEntity<String> response =
        // restTemplate.getForEntity("http://localhost:9989/test", String.class);
        // return response.getBody();
        // }catch (RestClientException ex){
        // System.out.println(ex.getMessage());
        // }
        // return null;
        // }
        //
        // @GetMapping("/test")
        // public String greeting(){
        // return "working";
        // }
    }

    /*
     * the RestTemplate class is a part of the Spring Web module and is used for
     * making HTTP requests to
     * external APIs or services. It provides a convenient way to interact with
     * RESTful web services and consume JSON or XML data.
     */
    /**
     * Error Handling:
     * RestTemplate throws RestClientException and its subclasses, like
     * HttpClientErrorException and HttpServerErrorException,
     * in case of client or server errors, respectively. You can catch these
     * exceptions and handle the errors accordingly.
     */
}
