package fr.cg95.cvq.service.request.leisure;

import java.util.Map;

import fr.cg95.cvq.service.request.IRequestService;

public interface IEcoleDeMusiqueRequestService extends IRequestService{

    public Map<String, Map<String, String>> getSiteProduit(Long requestId, Long userId);

}
