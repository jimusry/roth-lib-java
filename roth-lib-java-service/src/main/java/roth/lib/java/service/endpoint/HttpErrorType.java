package roth.lib.java.service.endpoint;

public enum HttpErrorType
{
	HTTP_METHOD_MISSING,
	HTTP_METHOD_NOT_SUPPORTED,
	HTTP_METHOD_NOT_IMPLEMENTED,
	HTTP_ORIGIN_UNSUPPORTED,
	SERVICE_METHOD_NAME_MISSING,
	SERVICE_NOT_IMPLEMENTED,
	SERVICE_METHOD_MISSING,
	SERVICE_METHOD_PARAMETER_INVALID,
	SERVICE_CSRF_TOKEN_INVALID,
	SERVICE_AJAX_NOT_AUTHENTICATED,
	SERVICE_API_NOT_AUTHENTICATED,
	SERVICE_CHANNEL_NOT_IMPLEMENTED,
	SERVICE_NOT_AUTHORIZED,
	REQUEST_FIELD_REQUIRED,
	REQUEST_FIELD_INVALID,
	;
}