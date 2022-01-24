package de.htwberlin.web.api;


import de.htwberlin.service.QuotesService;
import de.htwberlin.service.QuotesServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Endpunkt soll dem Client JSON liefern
public class QuotesRestController {

    QuotesService quotesService = new QuotesServiceImpl();

    @GetMapping(path = "/api/v1/quotes")
    public ResponseEntity<QuoteResponse> fetchQuoteByIndex(@RequestParam("index") int index){
        try{
            QuoteResponse quoteResponse = new QuoteResponse(quotesService.getQuote(index));
            return ResponseEntity.ok(quoteResponse);
        }
        catch (Exception e){
        return
        ResponseEntity.notFound().build();
        }
    }
}
